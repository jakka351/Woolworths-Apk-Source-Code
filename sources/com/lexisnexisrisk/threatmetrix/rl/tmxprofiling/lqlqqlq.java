package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import YU.a;

/* loaded from: classes6.dex */
public final class lqlqqlq {
    public static final String m006D006D006Dm006Dm = "__";
    public static final String m006Dm006Dm006Dm = "result";
    public static final String mm006D006Dm006Dm = "Cloned";
    public static final String mmm006Dm006Dm = "description";
    public static final String mmmm006D006Dm = "__orientation";
    public static final String m006Dmm006D006Dm = a.o(new StringBuilder("{\"description\":\""), llqqqlq.COULD_NOT_CHECK.m006D006Dm006D006Dm, "\"}");
    public static final String mm006Dm006D006Dm = a.o(new StringBuilder("{\"description\":\""), llqqqlq.JSON_EXCEPTION.m006D006Dm006D006Dm, "\"}");

    public enum llqqqlq {
        INCONSISTENT_PATH("Invalid Data Path", true),
        MULTIPLE_PID("Multiple PID same UID", true),
        INVALID_COMM_CONTENT("Invalid comm Name", true),
        COULD_NOT_CHECK("Could Not Check", false),
        JSON_EXCEPTION("Json exception", false),
        NOT_CLONED("Not Cloned", false);

        public String m006D006Dm006D006Dm;
        public boolean mmm006D006D006Dm;

        llqqqlq(String str, boolean z) {
            this.m006D006Dm006D006Dm = str;
            this.mmm006D006D006Dm = z;
        }

        public static llqqqlq valueOf(String str) {
            return (llqqqlq) nlnnnnn.ooo006F006Foo(llqqqlq.class, str);
        }
    }
}
