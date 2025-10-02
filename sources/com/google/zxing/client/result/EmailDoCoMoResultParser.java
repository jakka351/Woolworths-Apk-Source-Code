package com.google.zxing.client.result;

import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class EmailDoCoMoResultParser extends AbstractDoCoMoResultParser {
    static {
        Pattern.compile("[a-zA-Z0-9@.!#$%&'*+\\-/=?^_`{|}~]+");
    }
}
