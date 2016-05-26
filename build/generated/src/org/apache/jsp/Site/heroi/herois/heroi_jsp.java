package org.apache.jsp.Site.heroi.herois;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class heroi_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Site/heroi/herois/../header.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"icon\" type=\"image/jpg\" href=\"../icon.png\"/>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../style.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"banner\">\n");
      out.write("            <img src=\"../banner.jpg\" class=\"banner\"/>\n");
      out.write("            <input type=\"submit\" value=\"Pesquisar\"/>\n");
      out.write("            <input type=\"text\" placeholder=\"\"/>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"menu\">\n");
      out.write("            <ul class=\"menu\">\n");
      out.write("                <li id=\"active\"><a href=\"index.jsp\" target=\"_parent\">HOME</a></li>\n");
      out.write("                <li><a>HERÓIS</a>\n");
      out.write("                    <ul class=\"submenu\">\n");
      out.write("                        <li><a href=\"heroiscd.jsp\">DC</a></li>\n");
      out.write("                        <li><a href=\"heroismarvel.jsp\">Marvel</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li><a>ANTI-HERÓIS</a>\n");
      out.write("                    <ul class=\"submenu\">\n");
      out.write("                        <li><a href=\"antiheroisdc.jsp\">DC</a></li>\n");
      out.write("                        <li><a href=\"antiheroismarvel.jsp\">Marvel</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li><a>VILÕES</a>\n");
      out.write("                    <ul class=\"submenu\">\n");
      out.write("                        <li><a href=\"viloesdc.jsp\">DC</a></li>\n");
      out.write("                        <li><a href=\"viloesmarvel.jsp\">Marvel</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            <hr class=\"menu\"/>\n");
      out.write("        </div>");
      out.write("\n");
      out.write("<title>Exemplo</title>\n");
      out.write("<link rel=\"icon\" type=\"image/jpg\" href=\"../../icon.png\"/>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../../style.css\"/>\n");
      out.write("<form>\n");
      out.write("    <h6 id=\"codigo\">Código</h6>\n");
      out.write("    <h1 id=\"codinome\">Codinome</h1>\n");
      out.write("    <img src=\"foto.jpg\" class=\"foto\"/>\n");
      out.write("    <h5 id=\"nome\">Nome</h5>\n");
      out.write("    <p id=\"descricao\">Descrição: ########## ############## ########### ###########</p>\n");
      out.write("    <ul class=\"atributes\">\n");
      out.write("        <li class=\"atributes\">INTELIGÊNCIA</li>\n");
      out.write("        <li class=\"circle\">0</li>\n");
      out.write("        <li class=\"atributes\">FORÇA</li>\n");
      out.write("        <li class=\"circle\">0</li>\n");
      out.write("        <li class=\"atributes\">VELOCIDADE</li>\n");
      out.write("        <li class=\"circle\">0</li>\n");
      out.write("        <br/>\n");
      out.write("        <li class=\"atributes\">RESISTÊNCIA</li>\n");
      out.write("        <li class=\"circle\">0</li>\n");
      out.write("        <li class=\"atributes\">PROJECAO DE ENERGIA</li>\n");
      out.write("        <li class=\"circle\">0</li>\n");
      out.write("        <li class=\"atributes\">HABILIDADE DE COMBATE</li>\n");
      out.write("        <li class=\"circle\">0</li>\n");
      out.write("    </ul>\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
