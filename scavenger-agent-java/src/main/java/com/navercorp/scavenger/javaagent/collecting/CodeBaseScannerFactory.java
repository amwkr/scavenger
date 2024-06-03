package com.navercorp.scavenger.javaagent.collecting;

import java.io.IOException;

import com.navercorp.scavenger.javaagent.model.CodeBase;
import com.navercorp.scavenger.javaagent.model.Config;

public class CodeBaseScannerFactory {
    public static CodeBaseScanner create(Config config) {
        if (config.isRegexMode()) {
            return new RegexCodeBaseScanner(config);
        }

        return new PathsCodeBaseScanner(config);
    }
}
