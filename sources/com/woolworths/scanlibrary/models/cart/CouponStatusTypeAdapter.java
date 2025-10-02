package com.woolworths.scanlibrary.models.cart;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\r"}, d2 = {"Lcom/woolworths/scanlibrary/models/cart/CouponStatusTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/woolworths/scanlibrary/models/cart/CouponStatus;", "<init>", "()V", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "value", "read", "reader", "Lcom/google/gson/stream/JsonReader;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CouponStatusTypeAdapter extends TypeAdapter<CouponStatus> {
    public static final int $stable = 8;

    @Override // com.google.gson.TypeAdapter
    @NotNull
    public CouponStatus read(@Nullable JsonReader reader) {
        return CouponStatus.INSTANCE.fromStatusValue(reader != null ? reader.nextString() : null);
    }

    @Override // com.google.gson.TypeAdapter
    public void write(@Nullable JsonWriter out, @Nullable CouponStatus value) throws IOException {
        if (out != null) {
            out.value(value != null ? value.getStatus() : null);
        }
    }
}
