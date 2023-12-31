/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.kylelaker.aoc2023.solutions;

import com.kylelaker.aoc2023.ProblemInput;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day2Test {
    @Test
    void day2GameParser() throws Exception {
        // GIVEN
        var parser = Day2.GAME_PARSER;
        // WHEN
        File inputFile = new File(getClass().getClassLoader().getResource("inputs/2a.txt").getFile());
        ProblemInput input = ProblemInput.fromInputStream(new FileInputStream(inputFile));
        var result = input.asTransformedLines(parser);
        var first = result.getFirst();
        // THEN
        assertEquals(1, first.id());
        assertEquals(3, first.sets().size());
        assertEquals(5, result.size());
    }

    @Test
    void day2SolvesPart1() throws Exception {
        // GIVEN
        Day2 solver = new Day2();
        // WHEN
        File inputFile = new File(getClass().getClassLoader().getResource("inputs/2a.txt").getFile());
        ProblemInput input = ProblemInput.fromInputStream(new FileInputStream(inputFile));
        // THEN
        assertEquals(8, solver.part1(input));
    }

    @Test
    void day2SovesPart2SampleInput() throws Exception {
        // GIVEN
        Day2 solver = new Day2();
        // WHEN
        File inputFile = new File(getClass().getClassLoader().getResource("inputs/2a.txt").getFile());
        ProblemInput input = ProblemInput.fromInputStream(new FileInputStream(inputFile));
        // THEN
        assertEquals(2286, solver.part2(input));
    }
}
