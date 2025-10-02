package me.oriient.internal.services.websocket.protocols;

import java.util.regex.Pattern;

/* loaded from: classes7.dex */
public final class b implements a {
    static {
        Pattern.compile(" ");
        Pattern.compile(",");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "";
    }
}
