package com.snapchat.djinni;

import com.scandit.djinni.g;

/* loaded from: classes6.dex */
public abstract class Outcome<Result, Error> {

    /* renamed from: com.snapchat.djinni.Outcome$1, reason: invalid class name */
    class AnonymousClass1 extends Outcome<Object, Object> {
        @Override // com.snapchat.djinni.Outcome
        public final Object a(ResultHandler resultHandler, ErrorHandler errorHandler) {
            return resultHandler.apply();
        }
    }

    /* renamed from: com.snapchat.djinni.Outcome$2, reason: invalid class name */
    class AnonymousClass2 extends Outcome<Object, Object> {
        @Override // com.snapchat.djinni.Outcome
        public final Object a(ResultHandler resultHandler, ErrorHandler errorHandler) {
            return errorHandler.apply();
        }
    }

    public interface ErrorHandler<R, Error> {
        Object apply();
    }

    public interface ResultHandler<R, Result> {
        Object apply();
    }

    public abstract Object a(ResultHandler resultHandler, ErrorHandler errorHandler);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Outcome)) {
            return false;
        }
        Outcome outcome = (Outcome) obj;
        return ((Boolean) a(new a(outcome, 0), new a(outcome, 1))).booleanValue();
    }

    public final int hashCode() {
        Class<?> cls = getClass();
        return ((Integer) a(new g(cls, 2), new g(cls, 3))).intValue();
    }
}
