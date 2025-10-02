package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Set;

@DoNotMock
@Beta
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public interface Network<N, E> extends SuccessorsFunction<N>, PredecessorsFunction<N> {
    Set a();

    boolean b();

    Set c();

    boolean d();

    boolean h();

    EndpointPair l(Object obj);
}
