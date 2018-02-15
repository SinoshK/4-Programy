import java.util.Random;

public class Los {

  int losowanie(){
  Random generator = new Random();
  int losowa = generator.nextInt(1001);
  return losowa;
  }
}
