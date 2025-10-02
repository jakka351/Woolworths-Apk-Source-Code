package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class JsonNode extends JsonSerializable.Base implements TreeNode, Iterable<JsonNode> {

    /* renamed from: com.fasterxml.jackson.databind.JsonNode$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14228a;

        static {
            int[] iArr = new int[JsonNodeType.values().length];
            f14228a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14228a[6] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14228a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OverwriteMode {
        public static final /* synthetic */ OverwriteMode[] d = {new OverwriteMode("NONE", 0), new OverwriteMode("NULLS", 1), new OverwriteMode("SCALARS", 2), new OverwriteMode("ALL", 3)};

        /* JADX INFO: Fake field, exist only in values array */
        OverwriteMode EF5;

        public static OverwriteMode valueOf(String str) {
            return (OverwriteMode) Enum.valueOf(OverwriteMode.class, str);
        }

        public static OverwriteMode[] values() {
            return (OverwriteMode[]) d.clone();
        }
    }

    public String B() {
        return null;
    }

    public long i() {
        return j();
    }

    @Override // java.lang.Iterable
    public final Iterator<JsonNode> iterator() {
        return t();
    }

    public long j() {
        return 0L;
    }

    public abstract String k();

    public String l() {
        String strK = k();
        if (strK == null) {
            return null;
        }
        return strK;
    }

    public BigInteger m() {
        return BigInteger.ZERO;
    }

    public byte[] n() {
        return null;
    }

    public boolean o() {
        return false;
    }

    public BigDecimal q() {
        return BigDecimal.ZERO;
    }

    public double s() {
        return 0.0d;
    }

    public int size() {
        return 0;
    }

    public Iterator t() {
        return ClassUtil.c;
    }

    public Iterator u() {
        return ClassUtil.c;
    }

    public abstract JsonNode w(int i);

    public abstract JsonNodeType x();

    public final boolean y() {
        return x() == JsonNodeType.h;
    }

    public Number z() {
        return null;
    }
}
