package com.google.firebase.platforminfo;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ComponentFactory {
    @Override // com.google.firebase.components.ComponentFactory
    public final Object b(ComponentContainer componentContainer) {
        Set setB = componentContainer.b(LibraryVersion.class);
        GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar = GlobalLibraryVersionRegistrar.b;
        if (globalLibraryVersionRegistrar == null) {
            synchronized (GlobalLibraryVersionRegistrar.class) {
                try {
                    globalLibraryVersionRegistrar = GlobalLibraryVersionRegistrar.b;
                    if (globalLibraryVersionRegistrar == null) {
                        globalLibraryVersionRegistrar = new GlobalLibraryVersionRegistrar();
                        GlobalLibraryVersionRegistrar.b = globalLibraryVersionRegistrar;
                    }
                } finally {
                }
            }
        }
        return new DefaultUserAgentPublisher(setB, globalLibraryVersionRegistrar);
    }
}
