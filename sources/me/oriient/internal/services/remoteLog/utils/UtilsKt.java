package me.oriient.internal.services.remoteLog.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001c\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0000¨\u0006\u0007"}, d2 = {"deserializeMessageData", "", "", "", "data", "", "serializeMessageData", "internal_publishRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UtilsKt {
    @NotNull
    public static final Map<String, Object> deserializeMessageData(@NotNull byte[] data) throws Exception {
        Intrinsics.h(data, "data");
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    Object object = objectInputStream.readObject();
                    Intrinsics.f(object, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                    Map<String, Object> map = (Map) object;
                    objectInputStream.close();
                    byteArrayInputStream.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (Exception e) {
            throw new Exception(YU.a.f(e, new StringBuilder("Failed to de-serialize data from DB: ")));
        }
    }

    @NotNull
    public static final byte[] serializeMessageData(@NotNull Map<String, ? extends Object> data) throws Exception {
        Intrinsics.h(data, "data");
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream.writeObject(data);
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
        } catch (Exception e) {
            throw new Exception(YU.a.f(e, new StringBuilder("Failed to serialize data to store in DB: ")));
        }
    }
}
