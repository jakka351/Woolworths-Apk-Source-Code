package com.google.firebase.crashlytics;

import androidx.annotation.Keep;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005H\u0016¨\u0006\b"}, d2 = {"Lcom/google/firebase/crashlytics/FirebaseCrashlyticsKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "getComponents", "", "Lcom/google/firebase/components/Component;", "Companion", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FirebaseCrashlyticsKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<Component<?>> getComponents() {
        return EmptyList.d;
    }
}
