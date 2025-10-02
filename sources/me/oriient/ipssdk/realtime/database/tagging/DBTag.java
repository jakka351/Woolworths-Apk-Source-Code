package me.oriient.ipssdk.realtime.database.tagging;

import androidx.camera.core.impl.b;
import androidx.compose.ui.input.pointer.a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\b\u0010\u001e\u001a\u00020\tH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001f"}, d2 = {"Lme/oriient/ipssdk/realtime/database/tagging/DBTag;", "", "timestampMillis", "", "payload", "", "status", "retries", "spaceId", "", "(J[BJJLjava/lang/String;)V", "getPayload", "()[B", "getRetries", "()J", "getSpaceId", "()Ljava/lang/String;", "getStatus", "getTimestampMillis", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class DBTag {

    @NotNull
    private final byte[] payload;
    private final long retries;

    @Nullable
    private final String spaceId;
    private final long status;
    private final long timestampMillis;

    public DBTag(long j, @NotNull byte[] payload, long j2, long j3, @Nullable String str) {
        Intrinsics.h(payload, "payload");
        this.timestampMillis = j;
        this.payload = payload;
        this.status = j2;
        this.retries = j3;
        this.spaceId = str;
    }

    public static /* synthetic */ DBTag copy$default(DBTag dBTag, long j, byte[] bArr, long j2, long j3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = dBTag.timestampMillis;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            bArr = dBTag.payload;
        }
        byte[] bArr2 = bArr;
        if ((i & 4) != 0) {
            j2 = dBTag.status;
        }
        return dBTag.copy(j4, bArr2, j2, (i & 8) != 0 ? dBTag.retries : j3, (i & 16) != 0 ? dBTag.spaceId : str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTimestampMillis() {
        return this.timestampMillis;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final byte[] getPayload() {
        return this.payload;
    }

    /* renamed from: component3, reason: from getter */
    public final long getStatus() {
        return this.status;
    }

    /* renamed from: component4, reason: from getter */
    public final long getRetries() {
        return this.retries;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getSpaceId() {
        return this.spaceId;
    }

    @NotNull
    public final DBTag copy(long timestampMillis, @NotNull byte[] payload, long status, long retries, @Nullable String spaceId) {
        Intrinsics.h(payload, "payload");
        return new DBTag(timestampMillis, payload, status, retries, spaceId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DBTag)) {
            return false;
        }
        DBTag dBTag = (DBTag) other;
        return this.timestampMillis == dBTag.timestampMillis && Intrinsics.c(this.payload, dBTag.payload) && this.status == dBTag.status && this.retries == dBTag.retries && Intrinsics.c(this.spaceId, dBTag.spaceId);
    }

    @NotNull
    public final byte[] getPayload() {
        return this.payload;
    }

    public final long getRetries() {
        return this.retries;
    }

    @Nullable
    public final String getSpaceId() {
        return this.spaceId;
    }

    public final long getStatus() {
        return this.status;
    }

    public final long getTimestampMillis() {
        return this.timestampMillis;
    }

    public int hashCode() {
        int iB = b.b(b.b(a.d(Long.hashCode(this.timestampMillis) * 31, 31, this.payload), 31, this.status), 31, this.retries);
        String str = this.spaceId;
        return iB + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("\n  |DBTag [\n  |  timestampMillis: ");
        sb.append(this.timestampMillis);
        sb.append("\n  |  payload: ");
        String string = Arrays.toString(this.payload);
        Intrinsics.g(string, "toString(...)");
        sb.append(string);
        sb.append("\n  |  status: ");
        sb.append(this.status);
        sb.append("\n  |  retries: ");
        sb.append(this.retries);
        sb.append("\n  |  spaceId: ");
        sb.append(this.spaceId);
        sb.append("\n  |]\n  ");
        return StringsKt.n0(sb.toString());
    }
}
