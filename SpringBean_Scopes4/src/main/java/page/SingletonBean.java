
package page;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("singleton") //optional statement, by default singleton
public class SingletonBean implements ApplicationContextAware {
	
	private ApplicationContext ctx;
	
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx=ctx;
	}
		
	public PrototypeBean getInnerBean() {
		return ctx.getBean(PrototypeBean.class);
	}
	
	@PostConstruct
	public void init() {
		System.out.println("SingletonBean created.");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("SingletonBean destroyed.");
	}

	@Override
	public String toString() {
		return String.format("SingletonBean []");
	}

}
