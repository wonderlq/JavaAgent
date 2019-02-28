package com.merlin.test.agent;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;

/**
 * @author lq
 * @since 1.0.0
 * Created On 2019-01-31 10:16
 */
public class AgentTest {

    public static void premain(String agentOpt, Instrumentation inst) {
        instrument(agentOpt, inst);
    }

    public static void agentmain(String agentOpt, Instrumentation inst) {
        instrument(agentOpt, inst);
    }

    private static void instrument(String agentOpt, Instrumentation inst) {
        inst.addTransformer(new ClassFileTransformer() {
            @Override
            public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
                return null;
            }
        });
        System.out.println("Agent test");
    }
}
