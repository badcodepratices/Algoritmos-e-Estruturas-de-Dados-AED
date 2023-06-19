package AlgoritmosEstruturasdeDados.EstruturadeDadosLineares.Pilha;

public class Main {
    public static void main (String []args) throws FullStackException {
        ArrayStack stack = new ArrayStack(5);
        stack.push(30);
        stack.status("stack.push(30)",null);
        stack.push(3);
        stack.status("stack.push(3)",null);
        stack.top();
        stack.push(20);
        stack.status("stack.push(20)",null);
        stack.status("stack.pop()",null);
        stack.size();
        stack.isEmpty();
        stack.push(10);
        stack.status("stack.push(10)",null);
        stack.toString();

    }
}
