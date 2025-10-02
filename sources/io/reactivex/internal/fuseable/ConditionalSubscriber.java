package io.reactivex.internal.fuseable;

import io.reactivex.FlowableSubscriber;

/* loaded from: classes7.dex */
public interface ConditionalSubscriber<T> extends FlowableSubscriber<T> {
    boolean q(Object obj);
}
