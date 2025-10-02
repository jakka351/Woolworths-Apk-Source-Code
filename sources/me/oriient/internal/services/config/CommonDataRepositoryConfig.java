package me.oriient.internal.services.config;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lme/oriient/internal/services/config/CommonDataRepositoryConfig;", "", "retryRequestCount", "", "inMemoryStorageLimit", "inMemoryStorageCleanUpLimit", "maxConcurrentDownloadTasks", "(IIII)V", "getInMemoryStorageCleanUpLimit", "()I", "getInMemoryStorageLimit", "getMaxConcurrentDownloadTasks", "getRetryRequestCount", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CommonDataRepositoryConfig {
    private final int inMemoryStorageCleanUpLimit;
    private final int inMemoryStorageLimit;
    private final int maxConcurrentDownloadTasks;
    private final int retryRequestCount;

    public CommonDataRepositoryConfig() {
        this(0, 0, 0, 0, 15, null);
    }

    public static /* synthetic */ CommonDataRepositoryConfig copy$default(CommonDataRepositoryConfig commonDataRepositoryConfig, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = commonDataRepositoryConfig.retryRequestCount;
        }
        if ((i5 & 2) != 0) {
            i2 = commonDataRepositoryConfig.inMemoryStorageLimit;
        }
        if ((i5 & 4) != 0) {
            i3 = commonDataRepositoryConfig.inMemoryStorageCleanUpLimit;
        }
        if ((i5 & 8) != 0) {
            i4 = commonDataRepositoryConfig.maxConcurrentDownloadTasks;
        }
        return commonDataRepositoryConfig.copy(i, i2, i3, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getRetryRequestCount() {
        return this.retryRequestCount;
    }

    /* renamed from: component2, reason: from getter */
    public final int getInMemoryStorageLimit() {
        return this.inMemoryStorageLimit;
    }

    /* renamed from: component3, reason: from getter */
    public final int getInMemoryStorageCleanUpLimit() {
        return this.inMemoryStorageCleanUpLimit;
    }

    /* renamed from: component4, reason: from getter */
    public final int getMaxConcurrentDownloadTasks() {
        return this.maxConcurrentDownloadTasks;
    }

    @NotNull
    public final CommonDataRepositoryConfig copy(int retryRequestCount, int inMemoryStorageLimit, int inMemoryStorageCleanUpLimit, int maxConcurrentDownloadTasks) {
        return new CommonDataRepositoryConfig(retryRequestCount, inMemoryStorageLimit, inMemoryStorageCleanUpLimit, maxConcurrentDownloadTasks);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonDataRepositoryConfig)) {
            return false;
        }
        CommonDataRepositoryConfig commonDataRepositoryConfig = (CommonDataRepositoryConfig) other;
        return this.retryRequestCount == commonDataRepositoryConfig.retryRequestCount && this.inMemoryStorageLimit == commonDataRepositoryConfig.inMemoryStorageLimit && this.inMemoryStorageCleanUpLimit == commonDataRepositoryConfig.inMemoryStorageCleanUpLimit && this.maxConcurrentDownloadTasks == commonDataRepositoryConfig.maxConcurrentDownloadTasks;
    }

    public final int getInMemoryStorageCleanUpLimit() {
        return this.inMemoryStorageCleanUpLimit;
    }

    public final int getInMemoryStorageLimit() {
        return this.inMemoryStorageLimit;
    }

    public final int getMaxConcurrentDownloadTasks() {
        return this.maxConcurrentDownloadTasks;
    }

    public final int getRetryRequestCount() {
        return this.retryRequestCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.maxConcurrentDownloadTasks) + a.a(this.inMemoryStorageCleanUpLimit, a.a(this.inMemoryStorageLimit, Integer.hashCode(this.retryRequestCount) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("CommonDataRepositoryConfig(retryRequestCount=");
        sb.append(this.retryRequestCount);
        sb.append(", inMemoryStorageLimit=");
        sb.append(this.inMemoryStorageLimit);
        sb.append(", inMemoryStorageCleanUpLimit=");
        sb.append(this.inMemoryStorageCleanUpLimit);
        sb.append(", maxConcurrentDownloadTasks=");
        return YU.a.l(sb, this.maxConcurrentDownloadTasks, ')');
    }

    public CommonDataRepositoryConfig(int i, int i2, int i3, int i4) {
        this.retryRequestCount = i;
        this.inMemoryStorageLimit = i2;
        this.inMemoryStorageCleanUpLimit = i3;
        this.maxConcurrentDownloadTasks = i4;
    }

    public /* synthetic */ CommonDataRepositoryConfig(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 3 : i, (i5 & 2) != 0 ? 10 : i2, (i5 & 4) != 0 ? 5 : i3, (i5 & 8) != 0 ? 2 : i4);
    }
}
