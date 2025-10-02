package com.google.firebase.firestore.model;

import YU.a;

/* loaded from: classes6.dex */
public final class DatabaseId implements Comparable<DatabaseId> {
    public final String d;
    public final String e;

    public DatabaseId(String str, String str2) {
        this.d = str;
        this.e = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(DatabaseId databaseId) {
        DatabaseId databaseId2 = databaseId;
        int iCompareTo = this.d.compareTo(databaseId2.d);
        return iCompareTo != 0 ? iCompareTo : this.e.compareTo(databaseId2.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DatabaseId.class == obj.getClass()) {
            DatabaseId databaseId = (DatabaseId) obj;
            if (this.d.equals(databaseId.d) && this.e.equals(databaseId.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DatabaseId(");
        sb.append(this.d);
        sb.append(", ");
        return a.o(sb, this.e, ")");
    }
}
