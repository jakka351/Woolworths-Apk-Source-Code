package me.oriient.internal.infra.utils;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.FileManager;
import me.oriient.internal.infra.utils.core.FileManagerImpl;

/* loaded from: classes7.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f24986a = new a();

    public a() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new FileManagerImpl(FileManager.FileManagerFolders.FILES.getPath());
    }
}
