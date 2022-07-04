package interfaces;
// Cuando la clase detecta un método que es abstracto,
// inmediatamente presenta error. Por lo tanto, que hay que agregar
// la palabra reservada abstract a la clase. Es decir que solo puede servir como superclase.

public abstract class SeresVivos {
    // los métodos abstractos no se implementan (o sea, las llaves { })
    // solamente se definen (o sea, los paréntesis () finalizando con ;)
    public abstract void alimentarse();
}
