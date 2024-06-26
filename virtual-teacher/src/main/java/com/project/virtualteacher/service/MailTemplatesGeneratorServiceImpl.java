package com.project.virtualteacher.service;


import com.project.virtualteacher.service.contracts.MailTemplatesGeneratorService;
import org.springframework.stereotype.Service;


@Service
public class MailTemplatesGeneratorServiceImpl implements MailTemplatesGeneratorService {

    @Override
    public String generateConfirmationEmail(String username, String name, String link) {

        return
                "<div style=\"background-color:#fff;margin:0;padding:0\">" +
                        "<table class=\"m_nl-container\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"background-color:#fff\">" +
                            "<tbody>" +
                                "<tr>" + "<td>" +
                                    "<table class=\"m_row m_row-1\" align=\"center\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\">" +
                                        "<tbody>" +
                                            "<tr>" +
                                                "<td>" +
                                                    "<table class=\"m_row-content m_stack\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"color:#000;width:700px;margin:0 auto\" width=\"700\">" +
                                                        "<tbody>" +
                                                            "<tr>" +
                                                                "<td class=\"m_column m_column-1\" width=\"100%\" style=\"font-weight:400;text-align:left;padding-bottom:20px;padding-top:30px;vertical-align:top;border-top:0;border-right:0;border-bottom:0;border-left:0\">" +
                                                                    "<table class=\"m_empty_block m_block-1\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\">" +
                                                                        "<tbody>" +
                                                                            "<tr>" +
                                                                                "<td class=\"m_pad\">" +
                                                                                    "<div>" +
                                                                                    "</div>" +
                                                                                "</td>" +
                                                                            "</tr>" +
                                                                        "</tbody>" +
                                                                    "</table>" +
                                                                "</td>" +
                                                            "</tr>" +
                                                        "</tbody>" +
                                                    "</table>" +
                                                "</td>" +
                                            "</tr>" +
                                        "</tbody>" +
                                    "</table>" +
                                "<table class=\"m_row m_row-2\" align=\"center\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"background-color:#4a65ad;background-image:url(https://ci6.googleusercontent.com/proxy/h38ZWQM6K8R2jUt-w4Ms_pQlg7jRk9c9p8Gop3FnfvL9447UfoWP0axZS789FcJ2SM9ug9_B79MmjUfhcCvoQF3gF6ESD9b62tbXZntBaDha5HIdSKUK-nFXOLUE3mm1hqMIswJxl6FuHJxQGYDOCUI6mjeM1a_G1TSnScCRAkjYprkdLlwP7PnnIThrkLZ9Vy7-c4HaFohrVzql_qyAAGA73ezpi9G4BEo=s0-d-e1-ft#https://d15k2d11r6t6rl.cloudfront.net/public/users/Integrators/0db9f180-d222-4b2b-9371-cf9393bf4764/a31367d3-56d9-4984-bf48-79331695a0bc/galaxy-bg.png);background-position:top center;background-repeat:no-repeat\">" +
                            "<tbody>" +
                        "<tr>" +
                        "<td>" +
                        "<table class=\"m_row-content m_stack\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"color:#000;width:700px;margin:0 auto\" width=\"700\">" +
                        "<tbody>" +
                        "<tr>" +
                        "<td class=\"m_column m_column-1\" width=\"100%\" style=\"font-weight:400;text-align:left;padding-top:40px;vertical-align:top;border-top:0;border-right:0;border-bottom:0;border-left:0\"><table class=\"m_text_block m_block-1\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"word-break:break-word\">\n" +
                        "<tbody>" +
                        "<tr>" +
                        "<td class=\"m_pad\" style=\"padding-bottom:10px;padding-left:10px;padding-right:10px;padding-top:30px\"><div style=\"font-family:sans-serif\">" +
                        "<div style=\"font-size:12px;font-family:Arial,Helvetica Neue,Helvetica,sans-serif;color:#fff;line-height:1.2\">" +
                        "<p style=\"margin:0;font-size:14px;text-align:center\">" +
                        "<span style=\"font-size:30px\">" +
                        "<strong>" +
                        "Registration confirmation" +
                        "</strong>" +
                        "</span>" +
                        "</p>" +
                        "</div>" +
                        "</div>" +
                        "</td>" +
                        "</tr>" +
                        "</tbody>" +
                        "</table>" +
                        "<table class=\"m_text_block m_block-2\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"word-break:break-word\">" +
                        "<tbody>" +
                        "<tr>" +
                        "<td class=\"m_pad\" style=\"padding-bottom:10px;padding-left:20px;padding-right:20px;padding-top:10px\">" +
                        "<div style=\"font-family:sans-serif\">" +
                        "<div style=\"font-size:12px;font-family:Arial,Helvetica Neue,Helvetica,sans-serif;color:#d8ebf8;line-height:1.5\">" +
                        "<p style=\"margin:0;font-size:14px;text-align:center\">" +
                        "<span>Dear, "
                        + name + ", please follow this link to validate your registration and get started with Virtual Teacher:&nbsp;" +
                        "</span>" +
                        "</p>" +
                        "<p style=\"margin:0;font-size:14px;text-align:center\">" +
                        "<span> "
                        + link +
                        "</span>" +
                        "</p>" +
                        "</div>" +
                        "</div>" +
                        "</td>" +
                        "</tr>" +
                        "</tbody>" +
                        "</table>" +
                        "</td>" +
                        "</tr>" +
                        "</tbody>" +
                        "</table>" +
                        "</td>" +
                        "</tr>" +
                        "</tbody>" +
                        "</table>" +
                        "<table class=\"m_row m_row-3\" align=\"center\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\">" +
                        "<tbody>" +
                        "<tr>" +
                        "<td>" +
                        "<table class=\"m_row-content m_stack\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"color:#000;width:700px;margin:0 auto\" width=\"700\">" +
                        "<tbody>" +
                        "<tr>" +
                        "<td class=\"m_column m_column-1\" width=\"100%\" style=\"font-weight:400;text-align:left;vertical-align:top;border-top:0;border-right:0;border-bottom:0;border-left:0\"><table class=\"m_empty_block m_block-1\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\">" +
                        "<tbody>" +
                        "<tr>" +
                        "<td class=\"m_pad\">" +
                        "<div>" +
                        "</div>" +
                        "</td>" +
                        "</tr>" +
                        "</tbody>" +
                        "</table>" +
                        "</td>" +
                        "</tr>" +
                        "</tbody>" +
                        "</table>" +
                        "</td>" +
                        "</tr>" +
                        "</tbody>" +
                        "</table>" +
                        "<table class=\"m_row m_row-4\" align=\"center\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\">" +
                        "<tbody>" +
                        "<tr>" +
                        "<td>" +
                        "<table class=\"m_row-content m_stack\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"color:#000;width:700px;margin:0 auto\" width=\"700\">" +
                        "<tbody>" +
                        "<tr>" +
                        "<td class=\"m_column m_column-1\" width=\"100%\" style=\"font-weight:400;text-align:left;padding-bottom:25px;padding-top:25px;vertical-align:top;border-top:0;border-right:0;border-bottom:0;border-left:0\">" +
                        "<table class=\"m_text_block m_block-1\" width=\"100%\" border=\"0\" cellpadding=\"10\" cellspacing=\"0\" role=\"presentation\" style=\"word-break:break-word\">" +
                        "<tbody>" +
                        "<tr>" +
                        "<td class=\"m_pad\">" +
                        "<div style=\"font-family:sans-serif\"><div style=\"font-size:12px;font-family:Arial,Helvetica Neue,Helvetica,sans-serif;color:#555;line-height:1.2\">" +
                        "<p style=\"margin:0;font-size:14px;text-align:center\">" +
                        "<span style=\"font-size:12px\">" +
                        "<strong>" +
                        "Our mailing address:" +
                        "</strong>" +
                        "</span>" +
                        "</p>" +
                        "<p style=\"margin:0;font-size:14px;text-align:center\"><span style=\"font-size:12px\">"
                        + username +
                        "</span>" +
                        "</p>" +
                        "</div>" +
                        "</div>" +
                        "</td>" +
                        "</tr>" +
                        "</tbody>" +
                        "</table>" +
                        "</td>" +
                        "</tr>" +
                        "</tbody>" +
                        "</table>" +
                        "</td>" +
                        "</tr>" +
                        "</tbody>" +
                        "</table>" +
                        "</td>" +
                        "</tr>" +
                        "</tbody>" +
                        "</table>" +
                        "<div style=\"background-color:transparent\">\n" +
                        "    <div style=\"Margin:0 auto;min-width:320px;max-width:500px;word-wrap:break-word;word-break:break-word;background-color:transparent\" class=\"m_block-grid\">\n" +
                        "        <div style=\"border-collapse:collapse;display:table;width:100%;background-color:transparent\">\n" +
                        "            \n" +
                        "            \n" +
                        "            <div class=\"m_col m_num12\" style=\"min-width:320px;max-width:500px;display:table-cell;vertical-align:top\">\n" +
                        "                <div style=\"background-color:transparent;width:100%!important\">\n" +
                        "                    <div style=\"border-top:0px solid transparent;border-left:0px solid transparent;border-bottom:0px solid transparent;border-right:0px solid transparent;padding-top:15px;padding-bottom:15px;padding-right:0px;padding-left:0px\">\n" +
                        "                        \n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>" +
                        "</div>";
    }

}
