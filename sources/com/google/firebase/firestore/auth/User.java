package com.google.firebase.firestore.auth;

/* loaded from: classes6.dex */
public final class User {
    public static final User b = new User(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f15436a;

    public User(String str) {
        this.f15436a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && User.class == obj.getClass()) {
            String str = ((User) obj).f15436a;
            String str2 = this.f15436a;
            if (str2 != null) {
                return str2.equals(str);
            }
            if (str == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f15436a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return YU.a.o(new StringBuilder("User(uid:"), this.f15436a, ")");
    }
}
