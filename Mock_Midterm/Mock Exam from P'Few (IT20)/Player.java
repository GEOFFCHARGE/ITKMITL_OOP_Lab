public class Player {
    
    private Houses houses;
    private int hp = 20;
    private int mana = 50;
    private final int attackDamage = 2;
    private final String name;

    public Player() {
        this.name = "";
        this.hp = 0;
    }

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public int getHP() {
        return hp;
    }

    public Houses getHouses() {
        return houses;
    }

    public int getMana() {
        return mana;
    }

    public String getName() {
        return name;
    }

    public void setHP(int hp) {
        if (hp > 20) {
            this.hp = 20;
        }
        else if (hp < 0) {
            this.hp = 0;
        }
        else {
            this.hp = hp;
        }
    }

    public void setHouses(Houses houses) {
        this.houses = houses;
    }

    public void setMana(int mana) {
        if (mana > 50) {
            this.mana = 50;
        }
        else if (mana < 0) {
            this.mana = 0;
        }
        else {
            this.mana = mana;
        }
    }

    public void attack(Player target, Spell spell) {
        ((Magicable) getHouses()).attackSpell(this, target, spell);
        if (target.getHP() == 0) {
            System.out.println("[DEAD]: " + target.getName() + " was killed by " + getName());
        }
    }

    public boolean equals(Player player) {
        return getName().equals(player.getName()) && getHouses().equals(player.getHouses());
    }

    public void protectFromPlayer(Player target) {
        ((Magicable) getHouses()).defense(this, target);
    }

    @Override
    public String toString() {
        return "[Player] : " + getName() + " HP: " + getHP() + " Mana: " + getMana() + " || " + getHouses();
    }

}
