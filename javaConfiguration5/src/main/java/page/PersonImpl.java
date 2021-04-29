package page;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PersonImpl implements Person {
	// values from properties file
		@Value("${p.name}")
		private String name;
		@Value("${p.age}")
		private int age;
		@Value("${p.addr}")
		private String addr;

	public PersonImpl() {
	}

	public PersonImpl(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int getAge() {
		return age;
	}

	@Override
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String getAddr() {
		return addr;
	}

	@Override
	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return String.format("Person [name=%s, age=%s, addr=%s]", name, age, addr);
	}
}
