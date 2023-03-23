module UseModules {
    requires LearnModules;
    requires Greeter.api;

    uses com.example.greeterapi.Greeter;
}
