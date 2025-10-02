package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class Batch extends BasePendingResult<BatchResult> {
    private int zae;
    private boolean zaf;
    private boolean zag;
    private final PendingResult[] zah;
    private final Object zai;

    public static final class Builder {
        private final List zaa = new ArrayList();
        private final GoogleApiClient zab;

        public Builder(@NonNull GoogleApiClient googleApiClient) {
            this.zab = googleApiClient;
        }

        @NonNull
        public <R extends Result> BatchResultToken<R> add(@NonNull PendingResult<R> pendingResult) {
            List list = this.zaa;
            BatchResultToken<R> batchResultToken = new BatchResultToken<>(list.size());
            list.add(pendingResult);
            return batchResultToken;
        }

        @NonNull
        public Batch build() {
            return new Batch(this.zaa, this.zab, null);
        }
    }

    public /* synthetic */ Batch(List list, GoogleApiClient googleApiClient, byte[] bArr) {
        super(googleApiClient);
        this.zai = new Object();
        int size = list.size();
        this.zae = size;
        PendingResult[] pendingResultArr = new PendingResult[size];
        this.zah = pendingResultArr;
        if (list.isEmpty()) {
            setResult(new BatchResult(Status.RESULT_SUCCESS, pendingResultArr));
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            PendingResult pendingResult = (PendingResult) list.get(i);
            this.zah[i] = pendingResult;
            pendingResult.addStatusListener(new zaa(this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.PendingResult
    public void cancel() {
        super.cancel();
        int i = 0;
        while (true) {
            PendingResult[] pendingResultArr = this.zah;
            if (i >= pendingResultArr.length) {
                return;
            }
            pendingResultArr[i].cancel();
            i++;
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    @NonNull
    public BatchResult createFailedResult(@NonNull Status status) {
        return new BatchResult(status, this.zah);
    }

    public final /* synthetic */ int zab() {
        return this.zae;
    }

    public final /* synthetic */ void zac(int i) {
        this.zae = i;
    }

    public final /* synthetic */ boolean zad() {
        return this.zaf;
    }

    public final /* synthetic */ void zae(boolean z) {
        this.zaf = true;
    }

    public final /* synthetic */ boolean zaf() {
        return this.zag;
    }

    public final /* synthetic */ void zag(boolean z) {
        this.zag = true;
    }

    public final /* synthetic */ PendingResult[] zah() {
        return this.zah;
    }

    public final /* synthetic */ Object zai() {
        return this.zai;
    }
}
