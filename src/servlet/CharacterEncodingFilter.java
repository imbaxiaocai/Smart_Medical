package servlet;
import java.io.IOException;  
    import javax.servlet.Filter;  
    import javax.servlet.FilterChain;  
    import javax.servlet.FilterConfig;  
    import javax.servlet.ServletException;  
    import javax.servlet.ServletRequest;  
    import javax.servlet.ServletResponse;  
       
    public class CharacterEncodingFilter implements Filter {  
       
        protected FilterConfig filterConfig = null;  
        protected String encoding = "";  
       
        public void init(FilterConfig filterConfig) throws ServletException {  
            this.filterConfig = filterConfig;  
            this.encoding = filterConfig.getInitParameter("encoding");  
        }  
        public void doFilter(ServletRequest request, ServletResponse response,  
                FilterChain chain) throws IOException, ServletException {  
       
            request.setCharacterEncoding(this.encoding);  
            response.setCharacterEncoding(this.encoding);  
            response.setContentType("text/html;charset="+this.encoding);  
       
            chain.doFilter(request, response);  
        }  
        public void destroy() {  
            this.encoding = null;  
            this.filterConfig = null;  
        }  
    }  