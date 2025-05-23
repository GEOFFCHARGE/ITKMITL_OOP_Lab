public class Hufflepuff extends Houses implements Magicable {
    
    public Hufflepuff() {
        setName("Hufflepuff");
        setColor("YELLOW");
    }

    public void attackSpell(Player player, Player target, Spell spell) {
        target.setHP(target.getHP() - (spell.getDamage() + player.getAttackDamage()));
        if (spell instanceof Incendio) {
            player.setMana(player.getMana() - 3);
        }
        else {
            player.setMana(player.getMana() - 4);
        }
        System.out.println("[" + player.getName() + "]: use spell (" + spell.getName() + ")!");
    }

    public void defense(Player player, Player damager) {
        player.setHP(player.getHP() + 4);
        player.setMana(player.getMana() + 3);
        System.out.println("[" + player.getName() + "]: Protego !");
    }

}
