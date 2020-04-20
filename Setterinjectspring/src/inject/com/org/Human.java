package inject.com.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
private Heart heart;
@Autowired
@Qualifier("human1")
public void setHeart(Heart heart) {
	this.heart = heart;
	System.out.println("setter method");
}
public void startpumb()
{
heart.pump();
System.out.println("name of the animal is"+heart.getNameofanimal()+"no of heart"+heart.getNoheart());
}
}