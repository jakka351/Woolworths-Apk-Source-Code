package com.auth0.android.provider;

import androidx.compose.ui.platform.i;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/auth0/android/provider/PublicKeyNotFoundException;", "Lcom/auth0/android/provider/TokenValidationException;", "Companion", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PublicKeyNotFoundException extends TokenValidationException {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/auth0/android/provider/PublicKeyNotFoundException$Companion;", "", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public PublicKeyNotFoundException(String str) {
        super(i.a('\"', "Could not find a public key for kid \"", str), 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return PublicKeyNotFoundException.class.getSuperclass().getName() + ": " + getMessage();
    }
}
