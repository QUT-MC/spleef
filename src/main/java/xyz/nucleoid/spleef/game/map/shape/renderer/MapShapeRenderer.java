package xyz.nucleoid.spleef.game.map.shape.renderer;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import xyz.nucleoid.plasmid.registry.TinyRegistry;
import xyz.nucleoid.spleef.game.map.shape.ShapeCanvas;

import java.util.function.Function;

public interface MapShapeRenderer {
    TinyRegistry<Codec<? extends MapShapeRenderer>> REGISTRY = TinyRegistry.create();
    MapCodec<MapShapeRenderer> REGISTRY_CODEC = REGISTRY.dispatchMap(MapShapeRenderer::getCodec, Function.identity());

    void renderTo(ShapeCanvas canvas);

    default int getSpawnOffsetX() {
        return 0;
    }
    default int getSpawnOffsetZ() {
        return 0;
    }

    Codec<? extends MapShapeRenderer> getCodec();
}
