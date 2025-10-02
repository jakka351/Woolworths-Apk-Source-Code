package com.fasterxml.jackson.databind.cfg;

import java.io.Serializable;

/* loaded from: classes4.dex */
public class CoercionConfig implements Serializable {
    public static final int e = CoercionInputShape.values().length;
    public final CoercionAction[] d = new CoercionAction[e];
}
