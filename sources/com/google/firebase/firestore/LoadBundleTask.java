package com.google.firebase.firestore;

import android.app.Activity;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public class LoadBundleTask extends Task<LoadBundleTaskProgress> {

    public static class ManagedListener {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<LoadBundleTaskProgress> addOnCanceledListener(OnCanceledListener onCanceledListener) {
        throw null;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<LoadBundleTaskProgress> addOnCompleteListener(OnCompleteListener<LoadBundleTaskProgress> onCompleteListener) {
        throw null;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<LoadBundleTaskProgress> addOnFailureListener(OnFailureListener onFailureListener) {
        throw null;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<LoadBundleTaskProgress> addOnSuccessListener(OnSuccessListener<? super LoadBundleTaskProgress> onSuccessListener) {
        throw null;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task continueWith(Continuation continuation) {
        throw null;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task continueWithTask(Continuation continuation) {
        throw null;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception getException() {
        throw null;
    }

    @Override // com.google.android.gms.tasks.Task
    public final LoadBundleTaskProgress getResult() {
        throw null;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isCanceled() {
        throw null;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isComplete() {
        throw null;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isSuccessful() {
        throw null;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task onSuccessTask(SuccessContinuation successContinuation) {
        throw null;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<LoadBundleTaskProgress> addOnCanceledListener(Executor executor, OnCanceledListener onCanceledListener) {
        throw null;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<LoadBundleTaskProgress> addOnCompleteListener(Executor executor, OnCompleteListener<LoadBundleTaskProgress> onCompleteListener) {
        throw null;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<LoadBundleTaskProgress> addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        throw null;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<LoadBundleTaskProgress> addOnSuccessListener(Executor executor, OnSuccessListener<? super LoadBundleTaskProgress> onSuccessListener) {
        throw null;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task continueWith(Executor executor, Continuation continuation) {
        throw null;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task continueWithTask(Executor executor, Continuation continuation) {
        throw null;
    }

    @Override // com.google.android.gms.tasks.Task
    public final LoadBundleTaskProgress getResult(Class cls) {
        throw null;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task onSuccessTask(Executor executor, SuccessContinuation successContinuation) {
        throw null;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<LoadBundleTaskProgress> addOnCanceledListener(Activity activity, OnCanceledListener onCanceledListener) {
        throw null;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<LoadBundleTaskProgress> addOnCompleteListener(Activity activity, OnCompleteListener<LoadBundleTaskProgress> onCompleteListener) {
        throw null;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<LoadBundleTaskProgress> addOnFailureListener(Activity activity, OnFailureListener onFailureListener) {
        throw null;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<LoadBundleTaskProgress> addOnSuccessListener(Activity activity, OnSuccessListener<? super LoadBundleTaskProgress> onSuccessListener) {
        throw null;
    }
}
