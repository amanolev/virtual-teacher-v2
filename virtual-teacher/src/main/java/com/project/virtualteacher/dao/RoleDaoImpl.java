package com.project.virtualteacher.dao;

import com.project.virtualteacher.dao.contracts.RoleDao;
import com.project.virtualteacher.entity.Role;
import com.project.virtualteacher.exception_handling.error_message.ErrorMessage;
import com.project.virtualteacher.exception_handling.exceptions.EntityExistException;
import jakarta.persistence.*;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class RoleDaoImpl implements RoleDao {

    private final EntityManager em;

    public RoleDaoImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public Optional<Role> findById(int id) {
        Role role = em.find(Role.class, id);
        if (role == null) {
            return Optional.empty();
        }
        return Optional.of(role);
    }

    @Override
    public Optional<Role> findByName(String roleName) {

        TypedQuery<Role> query = em.createQuery("FROM Role WHERE value=:value", Role.class);
        query.setParameter("value", roleName);

        try {
            Role role = query.getSingleResult();
            return Optional.ofNullable(role);

        } catch (NoResultException e) {
            return Optional.empty();
        }
    }

    @Override
    public boolean isRoleNameExist(String roleName) {
        TypedQuery<Long> query = em.createQuery("SELECT COUNT(*) FROM Role WHERE value = :roleName", Long.class);
        query.setParameter("roleName", roleName);
        long result = query.getSingleResult();
        return result > 0;
    }

    @Override
    public void create(Role roleToCreate) {
        try {

            em.persist(roleToCreate);
        }
        catch (EntityExistsException e){
            throw new EntityExistException(ErrorMessage.ROLE_NAME_EXIST,roleToCreate.getValue());
        }
    }

    @Override
    public boolean isAssignedToUser(int id) {
        TypedQuery<Long> query = em.createQuery("SELECT COUNT(*) FROM User WHERE role.id = :id", Long.class);
        query.setParameter("id", id);
        Long result = query.getSingleResult();
        return result > 0;
    }

    @Override
    public Role update(Role roleToUpdate) {
     return em.merge(roleToUpdate);
    }

    @Override
    public void delete(Role roleToDelete) {
        em.remove(roleToDelete);
    }
}
