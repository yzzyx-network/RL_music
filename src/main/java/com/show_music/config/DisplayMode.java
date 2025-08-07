package com.show_music.config;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum DisplayMode {
    Overlay("Overlay"),
    Text("Text");

    private final String name;

    @Override
    public String toString()
    {
        return name;
    }
}
