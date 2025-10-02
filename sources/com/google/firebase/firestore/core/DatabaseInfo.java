package com.google.firebase.firestore.core;

import com.google.firebase.firestore.model.DatabaseId;

/* loaded from: classes6.dex */
public final class DatabaseInfo {

    /* renamed from: a, reason: collision with root package name */
    public final DatabaseId f15444a;
    public final String b;

    public DatabaseInfo(DatabaseId databaseId, String str) {
        this.f15444a = databaseId;
        this.b = str;
    }

    public final String toString() {
        return "DatabaseInfo(databaseId:" + this.f15444a + " host:firestore.googleapis.com)";
    }
}
