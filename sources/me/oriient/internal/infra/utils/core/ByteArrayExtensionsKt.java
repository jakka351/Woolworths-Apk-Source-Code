package me.oriient.internal.infra.utils.core;

import androidx.annotation.Keep;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\u001b\u0010\u0003\u001a\u0002H\u0004\"\b\b\u0000\u0010\u0004*\u00020\u0002*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"toByteArray", "", "Ljava/io/Serializable;", "toSerializableObject", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "([B)Ljava/io/Serializable;", "internal_publishRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ByteArrayExtensionsKt {
    @Keep
    @NotNull
    public static final byte[] toByteArray(@NotNull Serializable serializable) throws IOException {
        Intrinsics.h(serializable, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeObject(serializable);
                objectOutputStream.flush();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.g(byteArray, "toByteArray(...)");
                objectOutputStream.close();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    @Keep
    @NotNull
    public static final <T extends Serializable> T toSerializableObject(@NotNull byte[] bArr) throws IOException {
        Intrinsics.h(bArr, "<this>");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                Object object = objectInputStream.readObject();
                Intrinsics.f(object, "null cannot be cast to non-null type T of me.oriient.internal.infra.utils.core.ByteArrayExtensionsKt.toSerializableObject$lambda$3$lambda$2");
                T t = (T) object;
                objectInputStream.close();
                byteArrayInputStream.close();
                return t;
            } finally {
            }
        } finally {
        }
    }
}
