package com.navercorp.scavenger.javaagent.collecting;

import java.io.IOException;

import com.navercorp.scavenger.javaagent.model.CodeBase;

public interface CodeBaseScanner {
    public CodeBase scan() throws IOException;
}
