package gr.codelearn.jakarta.ed.example.interceptor;

import gr.codelearn.jakarta.ed.example.qualifier.ViewLogInterceptor;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Interceptor
@ViewLogInterceptor
public class ViewInterceptor {
    public ViewInterceptor() {
    }

    @AroundInvoke
    public Object logMethod(InvocationContext invocationContext) throws Exception{
        System.out.println("Invoke method: " + invocationContext.getMethod().getName() + "  | at class " + invocationContext.getMethod().getDeclaringClass().getName());
        return invocationContext.proceed();
    }
}
