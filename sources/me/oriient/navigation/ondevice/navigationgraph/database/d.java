package me.oriient.navigation.ondevice.navigationgraph.database;

import com.squareup.sqldelight.Transacter;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public interface d extends Transacter {

    @NotNull
    public static final c Companion = c.f26331a;

    @Override // com.squareup.sqldelight.Transacter
    /* synthetic */ void transaction(boolean z, @NotNull Function1 function1);

    @Override // com.squareup.sqldelight.Transacter
    /* synthetic */ Object transactionWithResult(boolean z, @NotNull Function1 function1);
}
