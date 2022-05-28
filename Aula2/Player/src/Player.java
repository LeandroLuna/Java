package Classes.Aula2.Player.src;

public class Player {
    private String name;
    private int xp;
    private int hp;
    private boolean poisoned;

    public Player() {
        xp = 1;
        hp = 50;
        poisoned = false;
    }

    public Player(String name) {
        this.name = name;
        xp = 1;
        hp = 50;
        poisoned = false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getXp() {
        return xp;
    }

    public int getHp() {
        return hp;
    }

    public boolean isPoisoned() {
        return poisoned;
    }

    public void setDamage(int newDamage) {
        hp -= newDamage;
    }

    public void setHeal(int newHeal) {
        hp += newHeal;
    }

    public void setXp(int newXp) {
        xp += newXp;
    }

    public void setPoison() {
        poisoned = true;
    }

    public String antidote() {
        if (poisoned) {
            poisoned = !poisoned;
            return "Jogador desenvenenado!";
        }
        return "Jogador nao esta envenenado!";
    }

}
