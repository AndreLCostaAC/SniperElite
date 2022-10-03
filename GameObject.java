import com.sun.org.apache.bcel.internal.generic.RETURN;

import javax.print.DocFlavor;

abstract public class GameObject {
 private String Type;

 public GameObject(String Type){
    this.Type = Type;
 }

 public String getType() {
  return Type;
 }
 public boolean isDead() {
  return false;
 }

 public abstract String getMessage();
}



