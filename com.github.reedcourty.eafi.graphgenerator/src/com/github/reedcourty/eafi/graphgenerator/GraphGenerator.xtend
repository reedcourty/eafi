package com.github.reedcourty.eafi.graphgenerator

import virtualization.Infrastructure

class GraphGenerator {
    
    new(Infrastructure infrastructure) {
        println("Constructor of GraphGenerator()");
        println(infrastructure);
        
        println(infrastructure.member);
        
    }
    
    def generate() {
        println("Generate...");
    }
}