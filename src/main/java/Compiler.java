public class Compiler {
    // Facade
    public void compile(String text){
        CompileScanner complileScanner = new CompileScanner(text);
        ProgramNodeBuilder programNodeBuilder = new ProgramNodeBuilder();
        Parser parser = new Parser();
        Action action = parser.parse(complileScanner, programNodeBuilder);
        action.execute();
    }

}
