package com.tealium.core.persistence;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/persistence/j;", "Lcom/tealium/core/persistence/HashingProvider;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class j implements HashingProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f19173a;

    static {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        Intrinsics.g(charArray, "this as java.lang.String).toCharArray()");
        f19173a = charArray;
    }

    public static String a(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(Charsets.f24671a);
        Intrinsics.g(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bytes2 = messageDigest.digest(bytes);
        Intrinsics.g(bytes2, "bytes");
        StringBuilder sb = new StringBuilder(bytes2.length * 2);
        for (byte b : bytes2) {
            char[] cArr = f19173a;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        String string = sb.toString();
        Intrinsics.g(string, "r.toString()");
        Locale ROOT = Locale.ROOT;
        Intrinsics.g(ROOT, "ROOT");
        String upperCase = string.toUpperCase(ROOT);
        Intrinsics.g(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }
}
