package com.google.zxing.client.result;

import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class VINResultParser extends ResultParser {
    static {
        Pattern.compile("[IOQ]");
        Pattern.compile("[A-Z0-9]{17}");
    }
}
