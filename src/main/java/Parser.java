public class Parser {
    public Action parse(CompileScanner compileScanner, ProgramNodeBuilder programNodeBuilder){
        return () -> System.out.println("wykonana akcja");
    }
}
