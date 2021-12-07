package ru.gb.patterns.behaviour.chain;

public class HandlerProcessor {

    private final AuthorityRequest request;

    public HandlerProcessor(AuthorityRequest request) {
        this.request = request;
    }

    void process(Handler... handlers) {
        for(Handler handler : handlers) {
            handler.handle(request);
        }
    }
}
