import java.util.Random;

public class Man {
        private Random rnd = new Random();

        public Man(String _name);

        {
            Name = _name;
            isLife = true;
        }

        private String Name;
        private int Age;
        private int Health;
        private boolean isLife;

        public void Talk() {

        }

        public void Go() {

        }

        public boolean IsAlive() {
            return isLife;
        }
    }

