package person

class Boss(bossDamage :Int) : Enemy(bossDamage) {
    override fun doDamage (target:BasePerson){
        super.doDamage(target)
        if (target is Hero ){
            target.destroy()
        }
    }
}