package me.oriient.internal.services.websocket.exceptions;

import java.nio.charset.CharacterCodingException;

/* loaded from: classes7.dex */
public class c extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final int f25671a;

    public c(int i) {
        this.f25671a = i;
    }

    public c(int i, String str) {
        super(str);
        this.f25671a = i;
    }

    public c(CharacterCodingException characterCodingException) {
        super(characterCodingException);
        this.f25671a = 1007;
    }
}
