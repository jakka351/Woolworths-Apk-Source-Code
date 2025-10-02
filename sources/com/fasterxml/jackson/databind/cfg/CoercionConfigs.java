package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class CoercionConfigs implements Serializable {
    public final MutableCoercionConfig e = new MutableCoercionConfig();
    public final CoercionAction d = CoercionAction.e;

    /* renamed from: com.fasterxml.jackson.databind.cfg.CoercionConfigs$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14233a;

        static {
            int[] iArr = new int[CoercionInputShape.values().length];
            f14233a = iArr;
            try {
                iArr[7] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14233a[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14233a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        int length = LogicalType.values().length;
    }
}
